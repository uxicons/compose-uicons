package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Ts.FolderLoop: ImageVector
    get() = _FolderLoop ?: UXIcon(name = "FolderLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(12.12f, 2f)
                lineTo(8.12f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 22f)
                lineTo(7.21f, 22f)
                curveToRelative(-0.09f, -0.32f, -0.16f, -0.66f, -0.19f, -1f)
                lineTo(1f, 21f)
                lineTo(1f, 7f)
                lineTo(23f, 7f)
                lineTo(23f, 15.62f)
                curveToRelative(0.36f, 0.18f, 0.69f, 0.4f, 1f, 0.66f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 6f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.88f, 1f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 6f)
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
                curveToRelative(1.72f, 0f, 2.99f, 1.84f, 3.39f, 2.5f)
                curveToRelative(-0.4f, 0.66f, -1.67f, 2.5f, -3.39f, 2.5f)
                close()
                moveTo(20.47f, 23f)
                curveToRelative(-1.72f, 0f, -2.99f, -1.84f, -3.39f, -2.5f)
                curveToRelative(0.4f, -0.66f, 1.67f, -2.5f, 3.39f, -2.5f)
                curveToRelative(1.4f, 0f, 2.53f, 1.12f, 2.53f, 2.5f)
                reflectiveCurveToRelative(-1.14f, 2.5f, -2.53f, 2.5f)
                close()
            }
        }.also { _FolderLoop = it}
