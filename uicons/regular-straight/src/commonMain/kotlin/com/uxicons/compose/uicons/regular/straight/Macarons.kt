package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Macarons: ImageVector? = null

val Icons.Rs.Macarons: ImageVector
    get() = _Macarons ?: UXIcon(name = "Macarons") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.64f, 0.81f, 3.09f, 2.03f, 4f)
                curveToRelative(-1.23f, 0.91f, -2.03f, 2.36f, -2.03f, 4f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.64f, -0.81f, -3.09f, -2.03f, -4f)
                curveToRelative(1.23f, -0.91f, 2.03f, -2.36f, 2.03f, -4f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18f, 8f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 5.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Macarons = it}
