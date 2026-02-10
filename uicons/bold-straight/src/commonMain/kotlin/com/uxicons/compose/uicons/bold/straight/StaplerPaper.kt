package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StaplerPaper: ImageVector? = null

val Icons.Bs.StaplerPaper: ImageVector
    get() = _StaplerPaper ?: UXIcon(name = "StaplerPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 6f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(2.0f, 2f)
                horizontalLineToRelative(8.51f)
                lineToRelative(-0.01f, -5.0f)
                curveToRelative(0f, -1.02f, -0.69f, -1.9f, -1.68f, -2.15f)
                lineToRelative(-10.39f, -2.78f)
                curveToRelative(-1.29f, -0.33f, -2.61f, 0.45f, -2.93f, 1.75f)
                lineToRelative(-0.42f, 1.73f)
                lineToRelative(1.43f, 0.37f)
                close()
                moveTo(20.99f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(4.69f, 7.99f)
                lineTo(0.79f, 11.89f)
                curveToRelative(-1.05f, 1.05f, -1.05f, 2.77f, 0f, 3.82f)
                lineToRelative(8.28f, 8.29f)
                lineToRelative(8.92f, -8.92f)
                lineToRelative(-7.08f, -7.09f)
                close()
                moveTo(9.07f, 19.76f)
                lineTo(3.12f, 13.8f)
                lineTo(5.93f, 10.99f)
                horizontalLineToRelative(0.05f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(1.84f, -1.84f)
                lineToRelative(3.92f, 3.92f)
                close()
            }
        }.also { _StaplerPaper = it}
