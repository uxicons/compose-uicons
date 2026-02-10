package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttentionDetail: ImageVector? = null

val Icons.Sr.AttentionDetail: ImageVector
    get() = _AttentionDetail ?: UXIcon(name = "AttentionDetail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 17f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.82f, -1.82f)
                curveToRelative(-0.98f, 0.7f, -2.18f, 1.11f, -3.47f, 1.11f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.29f, -0.42f, 2.49f, -1.11f, 3.47f)
                lineToRelative(1.82f, 1.82f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(20.74f, 17.83f)
                curveToRelative(0.33f, -0.5f, 0.33f, -1.16f, 0f, -1.66f)
                curveToRelative(-0.63f, -0.95f, -1.82f, -2.17f, -3.74f, -2.17f)
                curveToRelative(-1.97f, 0f, -3.17f, 1.28f, -3.79f, 2.24f)
                curveToRelative(-0.29f, 0.45f, -0.29f, 1.06f, 0f, 1.52f)
                curveToRelative(0.62f, 0.96f, 1.82f, 2.24f, 3.79f, 2.24f)
                curveToRelative(2.0f, 0f, 3.45f, -1.74f, 3.74f, -2.17f)
                close()
                moveTo(13f, 8f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.35f, -0.91f, -0.88f, -1.75f, -1.59f, -2.46f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-0.71f, -0.71f, -1.55f, -1.24f, -2.46f, -1.59f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, -3.01f, 1.67f, -5.63f, 4.14f, -7f)
                horizontalLineToRelative(-0.14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(10f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8.14f)
                curveToRelative(-2.46f, -1.36f, -4.14f, -3.99f, -4.14f, -7f)
                close()
            }
        }.also { _AttentionDetail = it}
