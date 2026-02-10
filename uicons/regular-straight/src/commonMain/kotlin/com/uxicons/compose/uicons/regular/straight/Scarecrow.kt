package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scarecrow: ImageVector? = null

val Icons.Rs.Scarecrow: ImageVector
    get() = _Scarecrow ?: UXIcon(name = "Scarecrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-8.06f)
                curveToRelative(0.67f, -0.89f, 1.06f, -2.01f, 1.06f, -3.23f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.07f, -1.11f, -1.0f, -2f, -2.14f, -2f)
                horizontalLineToRelative(-5.71f)
                curveToRelative(-1.13f, 0f, -2.06f, 0.89f, -2.14f, 2f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.08f, 0.36f, 2.14f, 1.0f, 3f)
                lineTo(0f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 4f)
                verticalLineToRelative(0.77f)
                curveToRelative(0f, 1.69f, -1.27f, 3.14f, -2.84f, 3.22f)
                curveToRelative(-0.84f, 0.05f, -1.62f, -0.25f, -2.23f, -0.82f)
                curveToRelative(-0.6f, -0.57f, -0.94f, -1.35f, -0.94f, -2.18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                lineTo(7f, 20f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Scarecrow = it}
