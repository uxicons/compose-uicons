package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PostalAddress: ImageVector? = null

val Icons.Rr.PostalAddress: ImageVector
    get() = _PostalAddress ?: UXIcon(name = "PostalAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.69f, 20.78f)
                curveToRelative(0.4f, 0.38f, 0.41f, 1.02f, 0.03f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.69f, -0.28f)
                lineToRelative(-5.36f, -5.14f)
                curveToRelative(-3.92f, -3.92f, -3.92f, -10.26f, -0.02f, -14.16f)
                curveTo(4.82f, 1.04f, 7.33f, 0f, 10f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(2.16f, 2.16f, 3.21f, 5.14f, 2.87f, 8.18f)
                curveToRelative(-0.06f, 0.55f, -0.55f, 0.94f, -1.1f, 0.88f)
                curveToRelative(-0.55f, -0.06f, -0.94f, -0.56f, -0.88f, -1.1f)
                curveToRelative(0.27f, -2.43f, -0.57f, -4.82f, -2.29f, -6.55f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                reflectiveCurveToRelative(-4.15f, 0.83f, -5.66f, 2.34f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.2f, 0f, 11.31f)
                lineToRelative(5.35f, 5.12f)
                close()
                moveTo(10f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 17f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15.59f, 16f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(-4.83f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-1.88f, 1.88f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-1.88f, -1.88f)
                verticalLineToRelative(3.76f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PostalAddress = it}
