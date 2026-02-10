package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMedicalAlt: ImageVector? = null

val Icons.Ts.FileMedicalAlt: ImageVector
    get() = _FileMedicalAlt ?: UXIcon(name = "FileMedicalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.77f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.23f)
                lineToRelative(2.33f, -3.49f)
                lineToRelative(3f, 6f)
                lineToRelative(1.67f, -2.51f)
                horizontalLineToRelative(4.77f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(-2.33f, 3.49f)
                lineToRelative(-3f, -6f)
                lineToRelative(-1.67f, 2.51f)
                close()
                moveTo(22f, 7.29f)
                verticalLineToRelative(16.71f)
                lineTo(2f, 24f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-1f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
            }
        }.also { _FileMedicalAlt = it}
