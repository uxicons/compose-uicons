package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Rs.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1.89f)
                lineToRelative(9.15f, -10.12f)
                lineTo(2f, 1.89f)
                verticalLineTo(0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4.8f)
                lineToRelative(9.05f, 10f)
                lineToRelative(-9.05f, 10f)
                horizontalLineToRelative(14.2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Total = it}
