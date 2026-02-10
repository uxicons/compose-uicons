package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayoutFluid: ImageVector? = null

val Icons.Br.LayoutFluid: ImageVector
    get() = _LayoutFluid ?: UXIcon(name = "LayoutFluid") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(42.67f, 0f)
            horizontalLineToRelative(234.67f)
            curveTo(300.9f, 0f, 320f, 19.1f, 320f, 42.67f)
            verticalLineTo(192f)
            curveToRelative(0f, 23.56f, -19.1f, 42.67f, -42.67f, 42.67f)
            horizontalLineTo(42.67f)
            curveTo(19.1f, 234.67f, 0f, 215.56f, 0f, 192f)
            verticalLineTo(42.67f)
            curveTo(0f, 19.1f, 19.1f, 0f, 42.67f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(405.33f, 0f)
            horizontalLineToRelative(64f)
            curveTo(492.9f, 0f, 512f, 19.1f, 512f, 42.67f)
            verticalLineTo(192f)
            curveToRelative(0f, 23.56f, -19.1f, 42.67f, -42.67f, 42.67f)
            horizontalLineToRelative(-64f)
            curveToRelative(-23.56f, 0f, -42.67f, -19.1f, -42.67f, -42.67f)
            verticalLineTo(42.67f)
            curveTo(362.67f, 19.1f, 381.77f, 0f, 405.33f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(42.67f, 277.33f)
            horizontalLineToRelative(64f)
            curveToRelative(23.56f, 0f, 42.67f, 19.1f, 42.67f, 42.67f)
            verticalLineToRelative(149.33f)
            curveToRelative(0f, 23.56f, -19.1f, 42.67f, -42.67f, 42.67f)
            horizontalLineToRelative(-64f)
            curveTo(19.1f, 512f, 0f, 492.9f, 0f, 469.33f)
            verticalLineTo(320f)
            curveTo(0f, 296.44f, 19.1f, 277.33f, 42.67f, 277.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(234.67f, 277.33f)
            horizontalLineToRelative(234.67f)
            curveTo(492.9f, 277.33f, 512f, 296.44f, 512f, 320f)
            verticalLineToRelative(149.33f)
            curveTo(512f, 492.9f, 492.9f, 512f, 469.33f, 512f)
            horizontalLineTo(234.67f)
            curveTo(211.1f, 512f, 192f, 492.9f, 192f, 469.33f)
            verticalLineTo(320f)
            curveTo(192f, 296.44f, 211.1f, 277.33f, 234.67f, 277.33f)
            close()
        }
    }.also { _LayoutFluid = it }
