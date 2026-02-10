package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotesMedical: ImageVector? = null

val Icons.Ss.NotesMedical: ImageVector
    get() = _NotesMedical ?: UXIcon(name = "NotesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 7f)
                verticalLineToRelative(17f)
                reflectiveCurveToRelative(20f, 0f, 20f, 0f)
                verticalLineToRelative(-2f)
                reflectiveCurveToRelative(-18f, 0f, -18f, 0f)
                lineTo(2f, 4.18f)
                curveTo(0.81f, 4.61f, 0.01f, 5.73f, 0f, 7f)
                close()
                moveTo(21f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 19.41f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                close()
            }
        }.also { _NotesMedical = it}
