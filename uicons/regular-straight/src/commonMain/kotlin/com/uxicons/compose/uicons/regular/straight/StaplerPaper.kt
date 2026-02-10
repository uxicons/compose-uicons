package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StaplerPaper: ImageVector? = null

val Icons.Rs.StaplerPaper: ImageVector
    get() = _StaplerPaper ?: UXIcon(name = "StaplerPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 5.99f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(9.01f)
                lineToRelative(-0.01f, -4.99f)
                curveToRelative(0f, -1.01f, -0.69f, -1.9f, -1.68f, -2.14f)
                lineToRelative(-10.39f, -2.77f)
                curveToRelative(-1.29f, -0.33f, -2.61f, 0.45f, -2.93f, 1.75f)
                lineToRelative(-0.34f, 1.44f)
                lineToRelative(1.35f, 0.36f)
                close()
                moveTo(20.99f, 5.99f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1f, 1.0f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1f, -1.0f)
                close()
                moveTo(5.12f, 7.98f)
                lineTo(0.66f, 12.43f)
                curveToRelative(-0.88f, 0.89f, -0.88f, 2.33f, 0f, 3.21f)
                lineToRelative(8.38f, 8.36f)
                lineToRelative(8.63f, -8.62f)
                lineToRelative(-7.42f, -7.41f)
                horizontalLineToRelative(-5.13f)
                close()
                moveTo(9.04f, 21.18f)
                lineTo(2.08f, 14.23f)
                curveToRelative(-0.11f, -0.11f, -0.11f, -0.29f, 0f, -0.4f)
                lineToRelative(3.57f, -3.56f)
                lineToRelative(2.2f, 2.19f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(4.96f, 4.95f)
                lineToRelative(-5.81f, 5.79f)
                close()
            }
        }.also { _StaplerPaper = it}
