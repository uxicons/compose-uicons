package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhone: ImageVector? = null

val Icons.Rs.SquarePhone: ImageVector
    get() = _SquarePhone ?: UXIcon(name = "SquarePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.74f, 13.45f)
                curveToRelative(-0.76f, -0.36f, -1.39f, -0.79f, -1.9f, -1.29f)
                curveToRelative(-0.52f, -0.51f, -0.95f, -1.13f, -1.29f, -1.88f)
                lineToRelative(1.7f, -1.7f)
                lineToRelative(-4.48f, -4.48f)
                lineToRelative(-2.11f, 2.1f)
                curveToRelative(-0.75f, 0.75f, -1.16f, 1.76f, -1.16f, 2.84f)
                curveToRelative(0f, 2.18f, 1.3f, 4.79f, 3.48f, 6.98f)
                curveToRelative(2.19f, 2.21f, 4.74f, 3.48f, 6.99f, 3.48f)
                curveToRelative(1.09f, 0f, 2.1f, -0.41f, 2.84f, -1.16f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-4.48f, -4.48f)
                lineToRelative(-1.7f, 1.7f)
                close()
                moveTo(16.39f, 16.93f)
                curveToRelative(-0.37f, 0.37f, -0.88f, 0.57f, -1.43f, 0.57f)
                curveToRelative(-1.69f, 0f, -3.77f, -1.08f, -5.57f, -2.89f)
                curveToRelative(-1.79f, -1.8f, -2.9f, -3.94f, -2.9f, -5.58f)
                curveToRelative(0f, -0.55f, 0.2f, -1.06f, 0.57f, -1.43f)
                lineToRelative(0.69f, -0.69f)
                lineToRelative(1.65f, 1.65f)
                lineToRelative(-1.22f, 1.22f)
                curveToRelative(0.5f, 1.44f, 1.24f, 2.84f, 2.24f, 3.79f)
                curveToRelative(0.93f, 0.95f, 2.35f, 1.71f, 3.77f, 2.24f)
                lineToRelative(1.23f, -1.23f)
                lineToRelative(1.65f, 1.65f)
                lineToRelative(-0.69f, 0.69f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SquarePhone = it}
