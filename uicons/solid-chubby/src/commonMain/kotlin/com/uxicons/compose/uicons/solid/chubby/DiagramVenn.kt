package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Sc.DiagramVenn: ImageVector
    get() = _DiagramVenn ?: UXIcon(name = "DiagramVenn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 4.5f)
                curveToRelative(-1.36f, 0f, -2.53f, 0.17f, -3.51f, 0.52f)
                lineToRelative(0.01f, -0.02f)
                curveToRelative(-0.96f, -0.34f, -2.11f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-5.12f, 0f, -7.5f, 2.38f, -7.5f, 7.5f)
                reflectiveCurveToRelative(2.38f, 7.5f, 7.5f, 7.5f)
                curveToRelative(1.39f, 0f, 2.53f, -0.16f, 3.5f, -0.5f)
                lineToRelative(-0.01f, -0.02f)
                curveToRelative(0.98f, 0.35f, 2.15f, 0.52f, 3.51f, 0.52f)
                curveToRelative(5.12f, 0f, 7.5f, -2.38f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-2.38f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(13.59f, 9f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(0.32f, -0.86f, 0.83f, -1.47f, 1.58f, -1.87f)
                curveToRelative(0.76f, 0.4f, 1.27f, 1.01f, 1.58f, 1.87f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -3.45f, 1.05f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.16f, 0f, 0.3f, 0.01f, 0.46f, 0.01f)
                curveToRelative(-0.64f, 1.15f, -0.95f, 2.64f, -0.95f, 4.49f)
                reflectiveCurveToRelative(0.32f, 3.34f, 0.95f, 4.49f)
                curveToRelative(-0.15f, 0.01f, -0.3f, 0.01f, -0.46f, 0.01f)
                curveToRelative(-3.45f, 0f, -4.5f, -1.05f, -4.5f, -4.5f)
                close()
                moveTo(12f, 16.87f)
                curveToRelative(-0.76f, -0.4f, -1.27f, -1.01f, -1.58f, -1.87f)
                horizontalLineToRelative(3.17f)
                curveToRelative(-0.32f, 0.86f, -0.83f, 1.47f, -1.58f, 1.87f)
                close()
                moveTo(13.96f, 13f)
                horizontalLineToRelative(-3.93f)
                curveToRelative(-0.02f, -0.32f, -0.04f, -0.64f, -0.04f, -1f)
                reflectiveCurveToRelative(0.01f, -0.68f, 0.04f, -1f)
                horizontalLineToRelative(3.93f)
                curveToRelative(0.02f, 0.32f, 0.04f, 0.64f, 0.04f, 1f)
                reflectiveCurveToRelative(-0.01f, 0.68f, -0.04f, 1f)
                close()
            }
        }.also { _DiagramVenn = it}
