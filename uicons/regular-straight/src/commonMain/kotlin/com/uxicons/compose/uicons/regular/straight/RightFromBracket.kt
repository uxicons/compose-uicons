package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RightFromBracket: ImageVector? = null

val Icons.Rs.RightFromBracket: ImageVector
    get() = _RightFromBracket ?: UXIcon(name = "RightFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.11f, 9.88f)
                lineTo(13f, 0.07f)
                lineTo(13f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(10f)
                lineTo(13f, 17f)
                verticalLineToRelative(6.95f)
                lineToRelative(10.12f, -9.82f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.13f)
                curveToRelative(0f, -0.8f, -0.31f, -1.56f, -0.89f, -2.13f)
                close()
                moveTo(21.71f, 12.7f)
                lineToRelative(-6.71f, 6.52f)
                verticalLineToRelative(-4.22f)
                lineTo(7f, 15f)
                verticalLineToRelative(-6f)
                lineTo(15f, 9f)
                lineTo(15f, 4.79f)
                lineToRelative(6.71f, 6.5f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.7f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.28f, 0.7f)
                close()
                moveTo(3f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(6f)
                lineTo(9f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _RightFromBracket = it}
