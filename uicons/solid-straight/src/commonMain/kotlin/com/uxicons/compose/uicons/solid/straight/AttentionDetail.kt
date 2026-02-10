package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttentionDetail: ImageVector? = null

val Icons.Ss.AttentionDetail: ImageVector
    get() = _AttentionDetail ?: UXIcon(name = "AttentionDetail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(22.14f, 23.55f)
                lineToRelative(-2.67f, -2.67f)
                curveToRelative(-0.98f, 0.7f, -2.18f, 1.11f, -3.47f, 1.11f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.29f, -0.42f, 2.49f, -1.11f, 3.47f)
                lineToRelative(2.67f, 2.67f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(20.5f, 16f)
                curveToRelative(-0.39f, -0.78f, -1.73f, -3f, -4.5f, -3f)
                reflectiveCurveToRelative(-4.12f, 2.22f, -4.5f, 3f)
                curveToRelative(0.38f, 0.78f, 1.73f, 3f, 4.5f, 3f)
                reflectiveCurveToRelative(4.12f, -2.22f, 4.5f, -3f)
                close()
                moveTo(15f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(15f, 0.59f)
                close()
                moveTo(8f, 16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(1.46f, 0f, 2.82f, 0.4f, 4f, 1.08f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                close()
            }
        }.also { _AttentionDetail = it}
