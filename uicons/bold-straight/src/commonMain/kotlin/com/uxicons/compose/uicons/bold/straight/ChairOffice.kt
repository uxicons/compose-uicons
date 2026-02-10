package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairOffice: ImageVector? = null

val Icons.Bs.ChairOffice: ImageVector
    get() = _ChairOffice ?: UXIcon(name = "ChairOffice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 7f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                lineTo(10.5f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                lineTo(24f, 10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.77f)
                curveToRelative(-0.29f, -0.17f, -0.64f, -0.27f, -1f, -0.27f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(8.5f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(16f, 14f)
                lineTo(8f, 14f)
                lineTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.5f, 10f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.36f, 0f, -0.71f, 0.1f, -1f, 0.27f)
                verticalLineToRelative(-3.77f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }.also { _ChairOffice = it}
