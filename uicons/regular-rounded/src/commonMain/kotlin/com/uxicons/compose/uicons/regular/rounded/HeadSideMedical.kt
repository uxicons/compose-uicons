package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMedical: ImageVector? = null

val Icons.Rr.HeadSideMedical: ImageVector
    get() = _HeadSideMedical ?: UXIcon(name = "HeadSideMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.9f, -0.26f, -1.73f, -0.74f, -2.36f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(22f, 13f)
                curveToRelative(-0.12f, -0.9f, -2.47f, -5.74f, -3.78f, -7.35f)
                curveToRelative(-1.76f, -2.34f, -4.38f, -3.65f, -7.22f, -3.65f)
                curveToRelative(-0.42f, 0f, -0.85f, 0.03f, -1.28f, 0.09f)
                curveToRelative(-4.08f, 0.56f, -7.31f, 3.96f, -7.69f, 8.07f)
                curveToRelative(-0.21f, 2.27f, 0.44f, 4.5f, 1.81f, 6.3f)
                curveToRelative(0.74f, 0.97f, 1.15f, 2.24f, 1.15f, 3.57f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.49f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.33f, -2.52f)
                curveToRelative(0.07f, -0.5f, 0.49f, -0.87f, 0.99f, -0.87f)
                horizontalLineToRelative(1.2f)
                close()
            }
        }.also { _HeadSideMedical = it}
