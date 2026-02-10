package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikingMountain: ImageVector? = null

val Icons.Sc.BikingMountain: ImageVector
    get() = _BikingMountain ?: UXIcon(name = "BikingMountain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 18.57f)
                arcToRelative(4.11f, 4.13f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.21f, 0f)
                arcToRelative(4.11f, 4.13f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.21f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.79f, 18.57f)
                arcToRelative(4.11f, 4.13f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.21f, 0f)
                arcToRelative(4.11f, 4.13f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.21f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.37f, 3.99f)
                arcToRelative(2.68f, 2.69f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.36f, 0f)
                arcToRelative(2.68f, 2.69f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.36f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.88f, 11.34f)
                curveToRelative(0.24f, -0.46f, 0.59f, -0.84f, 1.01f, -1.12f)
                lineToRelative(0.67f, -0.23f)
                lineToRelative(3.12f, 3.03f)
                curveToRelative(0.6f, 0.58f, 1.54f, 0.56f, 2.12f, -0.03f)
                reflectiveCurveToRelative(0.56f, -1.54f, -0.03f, -2.12f)
                lineToRelative(-3.78f, -3.67f)
                curveToRelative(-0.14f, -0.14f, -0.32f, -0.25f, -0.5f, -0.32f)
                lineToRelative(-3.61f, -1.4f)
                curveToRelative(-0.23f, -0.09f, -0.48f, -0.12f, -0.72f, -0.09f)
                curveToRelative(-2.45f, 0.3f, -4.48f, 2.12f, -5.06f, 4.54f)
                curveToRelative(-0.17f, 0.73f, 0.22f, 1.48f, 0.92f, 1.75f)
                lineToRelative(3.27f, 1.27f)
                lineToRelative(1.43f, 1.62f)
                curveToRelative(0.52f, 0.55f, 0.8f, 1.26f, 0.8f, 2.02f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0f, -1.52f, -0.57f, -2.97f, -1.58f, -4.04f)
                lineToRelative(-1.05f, -1.19f)
                close()
            }
        }.also { _BikingMountain = it}
