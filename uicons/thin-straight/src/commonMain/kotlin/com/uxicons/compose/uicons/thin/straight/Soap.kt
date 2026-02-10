package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Soap: ImageVector? = null

val Icons.Ts.Soap: ImageVector
    get() = _Soap ?: UXIcon(name = "Soap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.54f)
                verticalLineToRelative(-4.54f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 1f)
                horizontalLineToRelative(5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.54f)
                curveToRelative(-2.46f, 1.43f, -4f, 4.05f, -4f, 6.96f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.91f, -1.54f, -5.54f, -4f, -6.96f)
                close()
                moveTo(10f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.85f, 1.69f, -5.39f, 4.31f, -6.5f)
                horizontalLineToRelative(7.38f)
                curveToRelative(2.62f, 1.11f, 4.31f, 3.65f, 4.31f, 6.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5f)
                lineTo(7f, 15f)
                verticalLineToRelative(5f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Soap = it}
