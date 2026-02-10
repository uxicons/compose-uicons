package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairOffice: ImageVector? = null

val Icons.Ss.ChairOffice: ImageVector
    get() = _ChairOffice ?: UXIcon(name = "ChairOffice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                verticalLineTo(10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineTo(11f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(3f, 14.18f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.18f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.18f, -1f, -0.18f)
                horizontalLineTo(4f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                close()
            }
        }.also { _ChairOffice = it}
