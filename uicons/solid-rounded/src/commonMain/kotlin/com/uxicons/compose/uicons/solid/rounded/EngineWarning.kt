package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Sr.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.48f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, -1.64f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, -1.27f)
                arcToRelative(12.07f, 12.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.48f, 20f)
                close()
                moveTo(4.15f, 19.77f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -1.41f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.73f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.74f, 4.36f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0.13f)
                close()
                moveTo(20f, 12f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                curveTo(1.41f, 19.62f, 1.42f, 4.37f, 12f, 4f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                close()
                moveTo(13f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16f)
                close()
                moveTo(13f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _EngineWarning = it}
