package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMedicalAlt: ImageVector? = null

val Icons.Bs.FileMedicalAlt: ImageVector
    get() = _FileMedicalAlt ?: UXIcon(name = "FileMedicalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.8f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.2f)
                lineToRelative(2.92f, -4.39f)
                lineToRelative(3.17f, 5.75f)
                lineToRelative(0.91f, -1.36f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(-2.76f, 4.14f)
                lineToRelative(-3.17f, -5.75f)
                lineToRelative(-1.07f, 1.61f)
                close()
                moveTo(16.38f, 0f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(20f)
                verticalLineTo(5.67f)
                lineTo(16.38f, 0f)
                close()
            }
        }.also { _FileMedicalAlt = it}
