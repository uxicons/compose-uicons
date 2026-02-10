package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneFlip: ImageVector? = null

val Icons.Ts.SquarePhoneFlip: ImageVector
    get() = _SquarePhoneFlip ?: UXIcon(name = "SquarePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.89f, 3.79f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(2.28f, 2.28f)
                curveToRelative(-0.47f, 1.08f, -1.24f, 2.22f, -2.06f, 3.04f)
                curveToRelative(-0.82f, 0.83f, -1.96f, 1.6f, -3.04f, 2.06f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.97f, 1.97f)
                curveToRelative(0.74f, 0.74f, 1.74f, 1.15f, 2.82f, 1.15f)
                curveToRelative(2.34f, 0f, 5.18f, -1.43f, 7.6f, -3.82f)
                curveToRelative(2.39f, -2.41f, 3.82f, -5.25f, 3.82f, -7.6f)
                curveToRelative(0f, -1.08f, -0.41f, -2.08f, -1.15f, -2.82f)
                lineToRelative(-1.97f, -1.97f)
                close()
                moveTo(15.47f, 15.47f)
                curveToRelative(-2.2f, 2.18f, -4.84f, 3.53f, -6.89f, 3.53f)
                curveToRelative(-0.81f, 0f, -1.56f, -0.3f, -2.11f, -0.86f)
                lineToRelative(-1.26f, -1.26f)
                lineToRelative(2.58f, -2.58f)
                lineToRelative(2.04f, 2.04f)
                curveToRelative(1.43f, -0.51f, 2.91f, -1.43f, 3.99f, -2.52f)
                curveToRelative(1.1f, -1.08f, 2.02f, -2.56f, 2.53f, -3.99f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(2.58f, -2.58f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.55f, 0.55f, 0.85f, 1.3f, 0.85f, 2.11f)
                curveToRelative(0f, 2.05f, -1.35f, 4.7f, -3.53f, 6.89f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SquarePhoneFlip = it}
