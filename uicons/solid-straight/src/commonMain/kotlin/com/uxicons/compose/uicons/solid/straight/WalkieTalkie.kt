package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalkieTalkie: ImageVector? = null

val Icons.Ss.WalkieTalkie: ImageVector
    get() = _WalkieTalkie ?: UXIcon(name = "WalkieTalkie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(6.45f)
                curveToRelative(0f, 0.91f, -0.31f, 1.79f, -0.88f, 2.5f)
                lineToRelative(-1.12f, 1.4f)
                verticalLineToRelative(7.65f)
                lineTo(4f, 24f)
                verticalLineToRelative(-7.65f)
                lineToRelative(-1.12f, -1.4f)
                curveToRelative(-0.56f, -0.71f, -0.88f, -1.59f, -0.88f, -2.5f)
                verticalLineToRelative(-6.45f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                lineTo(10f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _WalkieTalkie = it}
