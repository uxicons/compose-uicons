package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotesMedical: ImageVector? = null

val Icons.Bs.NotesMedical: ImageVector
    get() = _NotesMedical ?: UXIcon(name = "NotesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(11.69f)
                lineToRelative(-4.45f, 3.81f)
                lineTo(5f, 19f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(3f, 5.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                lineTo(3f, 5.04f)
                close()
            }
        }.also { _NotesMedical = it}
