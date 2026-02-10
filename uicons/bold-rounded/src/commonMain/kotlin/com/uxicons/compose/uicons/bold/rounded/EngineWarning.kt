package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Br.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.1f, 20.18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.16f, -2.46f)
            arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.45f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.31f, -1.91f)
            arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15.27f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.1f, 20.18f)
            close()
            moveTo(4.86f, 19.84f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, -2.11f)
            arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.45f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -1.91f)
            arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.27f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, 0.2f)
            close()
            moveTo(19f, 12f)
            curveToRelative(-0.3f, 9.25f, -13.71f, 9.25f, -14f, 0f)
            curveTo(5.29f, 2.75f, 18.71f, 2.75f, 19f, 12f)
            close()
            moveTo(13.5f, 15.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15.5f)
            close()
            moveTo(13.5f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
    }.also { _EngineWarning = it }
