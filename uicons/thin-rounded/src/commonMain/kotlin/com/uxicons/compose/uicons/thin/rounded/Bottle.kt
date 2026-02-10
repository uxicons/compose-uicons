package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Tr.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.17f, 8.03f)
                lineToRelative(-2.17f, -0.87f)
                lineTo(15f, 1f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                lineTo(9f, 7.16f)
                lineToRelative(-2.17f, 0.87f)
                curveToRelative(-1.72f, 0.69f, -2.83f, 2.33f, -2.83f, 4.18f)
                verticalLineToRelative(7.29f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.29f)
                curveToRelative(0f, -1.85f, -1.11f, -3.49f, -2.83f, -4.18f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.29f)
                curveToRelative(0f, -1.44f, 0.86f, -2.71f, 2.2f, -3.25f)
                lineToRelative(2.48f, -0.99f)
                curveToRelative(0.19f, -0.08f, 0.31f, -0.26f, 0.31f, -0.46f)
                lineTo(10.0f, 1f)
                horizontalLineToRelative(4f)
                lineTo(14.0f, 7.5f)
                curveToRelative(0f, 0.2f, 0.12f, 0.39f, 0.31f, 0.46f)
                lineToRelative(2.48f, 0.99f)
                curveToRelative(1.34f, 0.54f, 2.2f, 1.81f, 2.2f, 3.25f)
                verticalLineToRelative(7.29f)
                close()
                moveTo(15.5f, 14f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Bottle = it}
