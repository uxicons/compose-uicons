package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Rr.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                curveToRelative(0.38f, 10.59f, 15.63f, 10.59f, 16f, 0f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(12f, 18f)
                curveTo(4.07f, 17.75f, 4.07f, 6.25f, 12f, 6f)
                curveTo(19.93f, 6.25f, 19.93f, 17.75f, 12f, 18f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9f)
                close()
                moveTo(24f, 12f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.74f, 7.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, -1.27f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, -1.27f)
                arcTo(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(4.29f, 18.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.54f, 1.27f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -15.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.29f, 5.64f)
                arcTo(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.29f, 18.36f)
                close()
                moveTo(13f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15f)
                close()
            }
        }.also { _EngineWarning = it}
