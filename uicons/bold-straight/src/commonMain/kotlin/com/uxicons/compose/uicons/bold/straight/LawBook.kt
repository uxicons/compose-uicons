package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LawBook: ImageVector? = null

val Icons.Bs.LawBook: ImageVector
    get() = _LawBook ?: UXIcon(name = "LawBook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 20f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0f, -0.02f, -0.01f, -0.04f, -0.01f, -0.05f)
                verticalLineToRelative(-0.65f)
                lineToRelative(0.75f, -2.29f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-15.5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(16.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0f, 2.21f, 1.79f, 4.0f, 4f, 4.0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                verticalLineToRelative(-12.14f)
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
