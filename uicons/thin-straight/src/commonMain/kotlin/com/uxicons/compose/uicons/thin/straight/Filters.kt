package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filters: ImageVector? = null

val Icons.Ts.Filters: ImageVector
    get() = _Filters ?: UXIcon(name = "Filters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19.88f)
                lineToRelative(-6f, -3.6f)
                verticalLineToRelative(-4.09f)
                lineTo(4f, 4.7f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.2f)
                lineToRelative(-7f, 7.5f)
                verticalLineToRelative(7.69f)
                close()
                moveTo(12f, 15.72f)
                lineToRelative(4f, 2.4f)
                verticalLineToRelative(-6.31f)
                lineToRelative(7f, -7.5f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 1.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.8f)
                lineToRelative(7f, 7.5f)
                verticalLineToRelative(3.91f)
                close()
                moveTo(12f, 19.21f)
                verticalLineToRelative(2.9f)
                lineToRelative(-4f, -2.4f)
                verticalLineToRelative(-3.91f)
                lineTo(1f, 8.3f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.65f, 0.42f, -1.2f, 1f, -1.41f)
                verticalLineToRelative(-1.04f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(2.2f)
                lineToRelative(7f, 7.5f)
                verticalLineToRelative(4.09f)
                lineToRelative(6f, 3.6f)
                verticalLineToRelative(-4.07f)
                lineToRelative(-1f, -0.6f)
                close()
            }
        }.also { _Filters = it}
