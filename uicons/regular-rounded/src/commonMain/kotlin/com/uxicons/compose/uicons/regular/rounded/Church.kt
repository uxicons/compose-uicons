package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Rr.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 12.49f)
                lineToRelative(-8.94f, -6.5f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.99f)
                lineTo(2.06f, 12.49f)
                curveToRelative(-1.29f, 0.94f, -2.06f, 2.45f, -2.06f, 4.04f)
                verticalLineToRelative(3.46f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3.46f)
                curveToRelative(0f, -1.59f, -0.77f, -3.11f, -2.06f, -4.04f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.63f)
                lineToRelative(5f, -3.64f)
                lineToRelative(5f, 3.64f)
                verticalLineToRelative(10.63f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 20f)
                verticalLineToRelative(-3.46f)
                curveToRelative(0f, -0.96f, 0.46f, -1.86f, 1.24f, -2.43f)
                lineToRelative(1.76f, -1.28f)
                verticalLineToRelative(9.17f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(11f, 22f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-9.17f)
                lineToRelative(1.76f, 1.28f)
                curveToRelative(0.77f, 0.56f, 1.24f, 1.47f, 1.24f, 2.43f)
                verticalLineToRelative(3.46f)
                close()
            }
        }.also { _Church = it}
