package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmarkCircle: ImageVector? = null

val Icons.Rr.FolderXmarkCircle: ImageVector
    get() = _FolderXmarkCircle ?: UXIcon(name = "FolderXmarkCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(19.71f, 15.71f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.1f)
                lineTo(8.87f, 0.32f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.15f, 0f, 0.31f, 0.04f, 0.45f, 0.1f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.41f, 0.21f, 0.88f, 0.32f, 1.34f, 0.32f)
                horizontalLineToRelative(6.53f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                lineTo(2f, 6.0f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _FolderXmarkCircle = it}
