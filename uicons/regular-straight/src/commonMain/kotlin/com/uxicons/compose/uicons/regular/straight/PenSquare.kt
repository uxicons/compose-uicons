package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSquare: ImageVector? = null

val Icons.Rs.PenSquare: ImageVector
    get() = _PenSquare ?: UXIcon(name = "PenSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(13.88f, 6.38f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                close()
                moveTo(9.41f, 16.5f)
                horizontalLineToRelative(-1.42f)
                verticalLineToRelative(-1.41f)
                lineToRelative(4.84f, -4.84f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.84f, 4.84f)
                close()
                moveTo(16.71f, 9.21f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _PenSquare = it}
