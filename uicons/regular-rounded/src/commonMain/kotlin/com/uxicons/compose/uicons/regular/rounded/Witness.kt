package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Witness: ImageVector? = null

val Icons.Rr.Witness: ImageVector
    get() = _Witness ?: UXIcon(name = "Witness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(8.5f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-1.02f)
                curveToRelative(-0.26f, -3.35f, -3.06f, -6f, -6.47f, -6f)
                reflectiveCurveToRelative(-6.22f, 2.65f, -6.47f, 6f)
                horizontalLineToRelative(-1.02f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.5f, 13f)
                curveToRelative(2.31f, 0f, 4.2f, 1.76f, 4.45f, 4f)
                horizontalLineToRelative(-8.9f)
                curveToRelative(0.25f, -2.24f, 2.14f, -4f, 4.45f, -4f)
                close()
                moveTo(23.12f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3f, 1.35f, -3f, 3.0f)
                verticalLineToRelative(5.62f)
                curveToRelative(0f, 0.88f, 0.63f, 1.38f, 1.36f, 1.38f)
                curveToRelative(0.29f, 0f, 0.59f, -0.09f, 0.86f, -0.29f)
                lineToRelative(2.13f, -1.71f)
                horizontalLineToRelative(1.65f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(22f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.23f, 0f, -0.45f, 0.08f, -0.63f, 0.22f)
                lineToRelative(-1.37f, 1.11f)
                verticalLineToRelative(-4.33f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.54f, -0.01f, 1.01f, 0.46f, 1f, 1.0f)
                close()
            }
        }.also { _Witness = it}
