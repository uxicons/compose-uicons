package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneFlip: ImageVector? = null

val Icons.Rs.SquarePhoneFlip: ImageVector
    get() = _SquarePhoneFlip ?: UXIcon(name = "SquarePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.23f, 4.09f)
                lineToRelative(-4.48f, 4.48f)
                lineToRelative(1.7f, 1.7f)
                curveToRelative(-0.35f, 0.75f, -0.78f, 1.37f, -1.29f, 1.88f)
                curveToRelative(-0.51f, 0.5f, -1.14f, 0.93f, -1.9f, 1.3f)
                lineToRelative(-1.7f, -1.7f)
                lineToRelative(-4.48f, 4.48f)
                lineToRelative(2.1f, 2.1f)
                curveToRelative(0.75f, 0.75f, 1.76f, 1.16f, 2.85f, 1.16f)
                curveToRelative(2.25f, 0f, 4.8f, -1.27f, 6.99f, -3.48f)
                curveToRelative(2.18f, -2.2f, 3.48f, -4.81f, 3.48f, -6.98f)
                curveToRelative(0f, -1.08f, -0.41f, -2.09f, -1.16f, -2.84f)
                lineToRelative(-2.1f, -2.1f)
                close()
                moveTo(14.6f, 14.61f)
                curveToRelative(-1.79f, 1.81f, -3.88f, 2.89f, -5.57f, 2.89f)
                curveToRelative(-0.55f, 0f, -1.06f, -0.2f, -1.43f, -0.58f)
                lineToRelative(-0.69f, -0.69f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(1.23f, 1.23f)
                curveToRelative(1.42f, -0.52f, 2.84f, -1.28f, 3.77f, -2.24f)
                curveToRelative(1.0f, -0.95f, 1.74f, -2.35f, 2.23f, -3.79f)
                lineToRelative(-1.22f, -1.22f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(0.37f, 0.37f, 0.58f, 0.88f, 0.58f, 1.43f)
                curveToRelative(0f, 1.64f, -1.11f, 3.77f, -2.9f, 5.58f)
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
        }.also { _SquarePhoneFlip = it}
