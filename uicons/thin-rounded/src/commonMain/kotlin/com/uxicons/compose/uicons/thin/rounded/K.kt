package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Tr.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.11f, 12.49f)
                lineTo(21.92f, 0.78f)
                curveToRelative(0.15f, -0.23f, 0.09f, -0.54f, -0.14f, -0.69f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.09f, -0.69f, 0.14f)
                lineToRelative(-7.85f, 11.78f)
                horizontalLineTo(3f)
                verticalLineTo(0.5f)
                curveToRelative(0.01f, -0.65f, -1.01f, -0.65f, -1f, 0f)
                verticalLineTo(12.44f)
                curveToRelative(-0.01f, 0.04f, -0.01f, 0.09f, 0f, 0.13f)
                verticalLineToRelative(10.94f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(13.25f)
                lineToRelative(7.85f, 10.79f)
                curveToRelative(0.16f, 0.23f, 0.48f, 0.27f, 0.7f, 0.11f)
                curveToRelative(0.22f, -0.16f, 0.27f, -0.47f, 0.11f, -0.7f)
                lineToRelative(-7.79f, -10.72f)
                close()
            }
        }.also { _K = it}
