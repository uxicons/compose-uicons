package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayoutFluid: ImageVector? = null

val Icons.Sr.LayoutFluid: ImageVector
    get() = _LayoutFluid ?: UXIcon(name = "LayoutFluid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(42.67f, 234.67f)
                horizontalLineToRelative(234.67f)
                curveTo(300.9f, 234.67f, 320f, 215.56f, 320f, 192f)
                verticalLineTo(42.67f)
                curveTo(320f, 19.1f, 300.9f, 0f, 277.33f, 0f)
                horizontalLineTo(42.67f)
                curveTo(19.1f, 0f, 0f, 19.1f, 0f, 42.67f)
                verticalLineTo(192f)
                curveTo(0f, 215.56f, 19.1f, 234.67f, 42.67f, 234.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(504.7f, 18.82f)
                curveTo(496.77f, 7.05f, 483.52f, 0f, 469.33f, 0f)
                horizontalLineToRelative(-64f)
                curveToRelative(-23.56f, 0f, -42.67f, 19.1f, -42.67f, 42.67f)
                verticalLineTo(192f)
                curveToRelative(0f, 23.56f, 19.1f, 42.67f, 42.67f, 42.67f)
                horizontalLineToRelative(64f)
                curveTo(492.9f, 234.67f, 512f, 215.56f, 512f, 192f)
                verticalLineTo(42.67f)
                curveTo(512.01f, 34.17f, 509.47f, 25.85f, 504.7f, 18.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(130.52f, 284.63f)
                curveToRelative(-7.04f, -4.77f, -15.35f, -7.31f, -23.85f, -7.3f)
                horizontalLineToRelative(-64f)
                curveTo(19.1f, 277.33f, 0f, 296.44f, 0f, 320f)
                verticalLineToRelative(149.33f)
                curveTo(0f, 492.9f, 19.1f, 512f, 42.67f, 512f)
                horizontalLineToRelative(64f)
                curveToRelative(23.56f, 0f, 42.67f, -19.1f, 42.67f, -42.67f)
                verticalLineTo(320f)
                curveTo(149.33f, 305.82f, 142.28f, 292.56f, 130.52f, 284.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(493.18f, 284.63f)
                curveToRelative(-7.04f, -4.77f, -15.35f, -7.31f, -23.85f, -7.3f)
                horizontalLineTo(234.67f)
                curveTo(211.1f, 277.33f, 192f, 296.44f, 192f, 320f)
                verticalLineToRelative(149.33f)
                curveTo(192f, 492.9f, 211.1f, 512f, 234.67f, 512f)
                horizontalLineToRelative(234.67f)
                curveTo(492.9f, 512f, 512f, 492.9f, 512f, 469.33f)
                verticalLineTo(320f)
                curveTo(512f, 305.82f, 504.95f, 292.56f, 493.18f, 284.63f)
                close()
            }
        }.also { _LayoutFluid = it}
