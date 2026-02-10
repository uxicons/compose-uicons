package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalkieTalkie: ImageVector? = null

val Icons.Rs.WalkieTalkie: ImageVector
    get() = _WalkieTalkie ?: UXIcon(name = "WalkieTalkie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 3f)
                horizontalLineToRelative(-7f)
                lineTo(12f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.45f)
                curveToRelative(0f, 0.91f, 0.31f, 1.79f, 0.88f, 2.5f)
                lineToRelative(1.12f, 1.4f)
                verticalLineToRelative(7.65f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-7.65f)
                lineToRelative(1.12f, -1.4f)
                curveToRelative(0.56f, -0.71f, 0.88f, -1.59f, 0.88f, -2.5f)
                verticalLineToRelative(-6.45f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(20f, 12.45f)
                curveToRelative(0f, 0.45f, -0.16f, 0.9f, -0.44f, 1.25f)
                lineToRelative(-1.56f, 1.95f)
                verticalLineToRelative(6.35f)
                lineTo(6f, 22.0f)
                verticalLineToRelative(-6.35f)
                lineToRelative(-1.56f, -1.95f)
                curveToRelative(-0.28f, -0.35f, -0.44f, -0.8f, -0.44f, -1.25f)
                verticalLineToRelative(-6.45f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.45f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                lineTo(6f, 7f)
                verticalLineToRelative(6f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _WalkieTalkie = it}
