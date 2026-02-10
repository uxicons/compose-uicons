package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListDropdown: ImageVector? = null

val Icons.Ts.ListDropdown: ImageVector
    get() = _ListDropdown ?: UXIcon(name = "ListDropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 1f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(1f, 9f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 10f)
                lineTo(23f, 10f)
                verticalLineToRelative(13f)
                lineTo(1f, 23f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 19f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 15f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16.55f, 7f)
                curveToRelative(0.4f, 0f, 0.77f, -0.15f, 1.05f, -0.43f)
                lineToRelative(3.63f, -3.57f)
                lineTo(11.87f, 3f)
                lineToRelative(3.62f, 3.56f)
                curveToRelative(0.28f, 0.28f, 0.66f, 0.44f, 1.05f, 0.44f)
                close()
                moveTo(18.78f, 4f)
                lineToRelative(-1.89f, 1.86f)
                curveToRelative(-0.18f, 0.18f, -0.5f, 0.19f, -0.69f, 0f)
                lineToRelative(-1.89f, -1.85f)
                horizontalLineToRelative(4.47f)
                close()
            }
        }.also { _ListDropdown = it}
