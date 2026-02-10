package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotesMedical: ImageVector? = null

val Icons.Rs.NotesMedical: ImageVector
    get() = _NotesMedical ?: UXIcon(name = "NotesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 22f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                lineTo(0f, 7f)
                curveToRelative(0.01f, -1.27f, 0.81f, -2.39f, 2f, -2.82f)
                verticalLineToRelative(17.82f)
                close()
                moveTo(15f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(12.03f)
                lineToRelative(-4.97f, 4.97f)
                lineTo(4f, 20f)
                lineTo(4f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(7f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _NotesMedical = it}
