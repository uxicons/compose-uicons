package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotesMedical: ImageVector? = null

val Icons.Ts.NotesMedical: ImageVector
    get() = _NotesMedical ?: UXIcon(name = "NotesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(12.71f)
                lineToRelative(-5.79f, 5.79f)
                lineTo(3f, 21f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(16f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(5.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(22.79f, 15f)
                horizontalLineToRelative(-4.79f)
                verticalLineToRelative(4.79f)
                lineToRelative(4.79f, -4.79f)
                close()
                moveTo(1f, 4.51f)
                curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                lineTo(1f, 23f)
                lineTo(1f, 4.51f)
                close()
            }
        }.also { _NotesMedical = it}
