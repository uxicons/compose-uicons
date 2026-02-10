package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMedicalAlt: ImageVector? = null

val Icons.Rs.FileMedicalAlt: ImageVector
    get() = _FileMedicalAlt ?: UXIcon(name = "FileMedicalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                lineTo(4f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(7.04f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.96f)
                lineToRelative(2.66f, -3.99f)
                lineToRelative(3f, 6f)
                lineToRelative(1.34f, -2.01f)
                horizontalLineToRelative(5.04f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-2.66f, 3.99f)
                lineToRelative(-3f, -6f)
                lineToRelative(-1.34f, 2.01f)
                close()
            }
        }.also { _FileMedicalAlt = it}
