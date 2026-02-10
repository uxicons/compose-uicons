package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilesMedical: ImageVector? = null

val Icons.Ts.FilesMedical: ImageVector
    get() = _FilesMedical ?: UXIcon(name = "FilesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.25f, 0f)
                horizontalLineToRelative(-7.75f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                lineTo(22f, 4.75f)
                lineTo(17.25f, 0f)
                close()
                moveTo(17f, 1.17f)
                lineToRelative(3.83f, 3.83f)
                horizontalLineToRelative(-3.83f)
                lineTo(17f, 1.17f)
                close()
                moveTo(17f, 23f)
                lineTo(3f, 23f)
                lineTo(3f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-13f)
                lineTo(8f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _FilesMedical = it}
