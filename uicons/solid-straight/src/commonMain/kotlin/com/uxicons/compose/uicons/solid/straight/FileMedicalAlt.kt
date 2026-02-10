package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMedicalAlt: ImageVector? = null

val Icons.Ss.FileMedicalAlt: ImageVector
    get() = _FileMedicalAlt ?: UXIcon(name = "FileMedicalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 7f)
                verticalLineToRelative(17f)
                horizontalLineTo(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(5.04f)
                lineToRelative(1.34f, -2.01f)
                lineToRelative(3f, 6f)
                lineToRelative(2.66f, -3.99f)
                horizontalLineToRelative(3.96f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.04f)
                lineToRelative(-1.34f, 2.01f)
                lineToRelative(-3f, -6f)
                lineToRelative(-2.66f, 3.99f)
                horizontalLineToRelative(-3.96f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(17f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(17f, 0.59f)
                close()
            }
        }.also { _FileMedicalAlt = it}
