package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Loveseat: ImageVector? = null

val Icons.Rs.Loveseat: ImageVector
    get() = _Loveseat ?: UXIcon(name = "Loveseat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                lineTo(0f, 8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                close()
                moveTo(11f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(12f, 15.36f)
                curveToRelative(-0.73f, -0.83f, -1.81f, -1.36f, -3f, -1.36f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.19f, 0f, -2.27f, 0.53f, -3f, 1.36f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Loveseat = it}
