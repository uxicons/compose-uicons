package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PatientFile: ImageVector? = null

val Icons.Ss.PatientFile: ImageVector
    get() = _PatientFile ?: UXIcon(name = "PatientFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                horizontalLineToRelative(-9.26f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-4.74f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 18f)
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
                close()
                moveTo(5f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.41f)
                lineToRelative(3.59f, 3.59f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(-6.79f)
                lineToRelative(-4f, -2f)
                close()
            }
        }.also { _PatientFile = it}
