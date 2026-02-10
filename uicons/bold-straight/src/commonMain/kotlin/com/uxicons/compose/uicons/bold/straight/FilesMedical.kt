package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilesMedical: ImageVector? = null

val Icons.Bs.FilesMedical: ImageVector
    get() = _FilesMedical ?: UXIcon(name = "FilesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 3.3f)
                lineTo(18.81f, 0.07f)
                lineToRelative(-7.31f, -0.07f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                lineTo(22f, 3.3f)
                close()
                moveTo(14f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 15f)
                lineTo(11f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.48f, -0.5f)
                lineToRelative(4.51f, 0.05f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _FilesMedical = it}
