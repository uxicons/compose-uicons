package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawBook: ImageVector? = null

val Icons.Rs.LawBook: ImageVector
    get() = _LawBook ?: UXIcon(name = "LawBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 21f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                verticalLineToRelative(-15.18f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 18.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(0.84f, -2.66f)
                horizontalLineToRelative(-1.84f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.82f)
                lineToRelative(0.93f, 2.6f)
                verticalLineToRelative(0.57f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.11f, 1.03f, -0.98f, 1.83f, -2.04f, 1.83f)
                curveToRelative(-1.14f, 0f, -2.05f, -0.92f, -2.05f, -2.05f)
                verticalLineToRelative(-0.33f)
                lineToRelative(1.5f, -4.61f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.5f, 4.66f)
                close()
            }
        }.also { _LawBook = it}
