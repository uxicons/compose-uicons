package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Rc.DiagramVenn: ImageVector
    get() = _DiagramVenn ?: UXIcon(name = "DiagramVenn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 4.5f)
                curveToRelative(-1.36f, 0f, -2.52f, 0.17f, -3.5f, 0.49f)
                curveToRelative(-0.98f, -0.33f, -2.14f, -0.49f, -3.5f, -0.49f)
                curveToRelative(-5.19f, 0f, -7.5f, 2.31f, -7.5f, 7.5f)
                reflectiveCurveToRelative(2.31f, 7.5f, 7.5f, 7.5f)
                curveToRelative(1.36f, 0f, 2.52f, -0.17f, 3.5f, -0.49f)
                curveToRelative(0.98f, 0.33f, 2.14f, 0.49f, 3.5f, 0.49f)
                curveToRelative(5.19f, 0f, 7.5f, -2.31f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-2.31f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(12f, 7.13f)
                curveToRelative(0.76f, 0.4f, 1.27f, 1.01f, 1.58f, 1.87f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(0.32f, -0.86f, 0.83f, -1.47f, 1.58f, -1.87f)
                close()
                moveTo(9.6f, 17.46f)
                curveToRelative(-0.34f, 0.03f, -0.7f, 0.04f, -1.1f, 0.04f)
                curveToRelative(-4.11f, 0f, -5.5f, -1.39f, -5.5f, -5.5f)
                reflectiveCurveToRelative(1.39f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.39f, 0f, 0.75f, 0.02f, 1.1f, 0.04f)
                curveToRelative(-1.08f, 1.23f, -1.6f, 3.02f, -1.6f, 5.46f)
                reflectiveCurveToRelative(0.52f, 4.23f, 1.6f, 5.46f)
                close()
                moveTo(12f, 16.87f)
                curveToRelative(-0.76f, -0.4f, -1.27f, -1.01f, -1.58f, -1.87f)
                horizontalLineToRelative(3.17f)
                curveToRelative(-0.32f, 0.86f, -0.83f, 1.47f, -1.58f, 1.87f)
                close()
                moveTo(13.96f, 13.0f)
                horizontalLineToRelative(-3.93f)
                curveToRelative(-0.02f, -0.32f, -0.04f, -0.64f, -0.04f, -1f)
                reflectiveCurveToRelative(0.01f, -0.68f, 0.04f, -1f)
                horizontalLineToRelative(3.93f)
                curveToRelative(0.02f, 0.32f, 0.04f, 0.64f, 0.04f, 1f)
                reflectiveCurveToRelative(-0.01f, 0.68f, -0.04f, 1f)
                close()
            }
        }.also { _DiagramVenn = it}
