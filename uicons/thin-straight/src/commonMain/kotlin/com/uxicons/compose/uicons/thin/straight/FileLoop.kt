package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileLoop: ImageVector? = null

val Icons.Ts.FileLoop: ImageVector
    get() = _FileLoop ?: UXIcon(name = "FileLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(12f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7.2f)
                curveToRelative(0.32f, -0.09f, 0.65f, -0.14f, 1f, -0.17f)
                lineTo(20f, 7.29f)
                lineTo(12.71f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(8.27f, 24f)
                curveToRelative(-0.26f, -0.31f, -0.47f, -0.64f, -0.66f, -1f)
                lineTo(1f, 23f)
                close()
                moveTo(13f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(13f, 1.71f)
                close()
                moveTo(20.47f, 17f)
                curveToRelative(-1.92f, 0f, -3.3f, 1.59f, -3.97f, 2.55f)
                curveToRelative(-0.67f, -0.96f, -2.05f, -2.55f, -3.97f, -2.55f)
                curveToRelative(-1.95f, 0f, -3.53f, 1.57f, -3.53f, 3.5f)
                reflectiveCurveToRelative(1.58f, 3.5f, 3.53f, 3.5f)
                curveToRelative(1.92f, 0f, 3.3f, -1.59f, 3.97f, -2.55f)
                curveToRelative(0.67f, 0.96f, 2.05f, 2.55f, 3.97f, 2.55f)
                curveToRelative(1.95f, 0f, 3.53f, -1.57f, 3.53f, -3.5f)
                reflectiveCurveToRelative(-1.58f, -3.5f, -3.53f, -3.5f)
                close()
                moveTo(12.53f, 23f)
                curveToRelative(-1.4f, 0f, -2.53f, -1.12f, -2.53f, -2.5f)
                reflectiveCurveToRelative(1.14f, -2.5f, 2.53f, -2.5f)
                curveToRelative(1.72f, 0f, 3.0f, 1.84f, 3.39f, 2.5f)
                curveToRelative(-0.4f, 0.66f, -1.67f, 2.5f, -3.39f, 2.5f)
                close()
                moveTo(20.47f, 23f)
                curveToRelative(-1.72f, 0f, -3.0f, -1.84f, -3.39f, -2.5f)
                curveToRelative(0.4f, -0.66f, 1.67f, -2.5f, 3.39f, -2.5f)
                curveToRelative(1.4f, 0f, 2.53f, 1.12f, 2.53f, 2.5f)
                reflectiveCurveToRelative(-1.14f, 2.5f, -2.53f, 2.5f)
                close()
            }
        }.also { _FileLoop = it}
