package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mcdonalds: ImageVector? = null

val Icons.Brand.Mcdonalds: ImageVector
    get() = _Mcdonalds ?: UXIcon(name = "Mcdonalds") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.77f, 2.4f)
            curveToRelative(-1.94f, 0f, -3.67f, 2.58f, -4.8f, 6.62f)
            curveTo(9.84f, 4.98f, 8.11f, 2.4f, 6.17f, 2.4f)
            curveTo(2.76f, 2.4f, 0f, 11.0f, 0f, 21.6f)
            horizontalLineToRelative(2.74f)
            curveToRelative(0f, -9.85f, 1.53f, -17.83f, 3.43f, -17.83f)
            curveToRelative(1.89f, 0f, 3.43f, 7.37f, 3.43f, 16.46f)
            horizontalLineToRelative(2.74f)
            curveToRelative(0f, -9.09f, 1.53f, -16.46f, 3.43f, -16.46f)
            reflectiveCurveTo(19.2f, 11.75f, 19.2f, 21.6f)
            horizontalLineToRelative(2.74f)
            curveTo(21.94f, 11.0f, 19.18f, 2.4f, 15.77f, 2.4f)
            lineTo(15.77f, 2.4f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(23.32f, 20.23f)
            curveToRelative(-0.0f, 0f, -0.0f, 0f, -0.01f, 0f)
            curveToRelative(-0.37f, 0f, -0.69f, 0.29f, -0.69f, 0.68f)
            curveToRelative(-0.0f, 0.38f, 0.3f, 0.69f, 0.68f, 0.69f)
            curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
            curveToRelative(0.37f, 0f, 0.68f, -0.29f, 0.68f, -0.69f)
            curveTo(24.0f, 20.54f, 23.7f, 20.23f, 23.32f, 20.23f)
            close()
            moveTo(23.32f, 21.5f)
            curveToRelative(-0.32f, 0f, -0.56f, -0.25f, -0.56f, -0.59f)
            curveToRelative(0f, -0.33f, 0.24f, -0.58f, 0.56f, -0.58f)
            curveToRelative(0.32f, 0f, 0.56f, 0.25f, 0.56f, 0.58f)
            curveTo(23.88f, 21.25f, 23.63f, 21.5f, 23.32f, 21.5f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(23.3f, 20.87f)
            horizontalLineToRelative(-0.13f)
            verticalLineToRelative(-0.26f)
            horizontalLineToRelative(0.16f)
            curveToRelative(0.08f, 0f, 0.17f, 0.02f, 0.17f, 0.12f)
            curveTo(23.51f, 20.86f, 23.41f, 20.87f, 23.3f, 20.87f)
            lineTo(23.3f, 20.87f)
            close()
            moveTo(23.64f, 20.74f)
            curveToRelative(0f, -0.15f, -0.09f, -0.23f, -0.28f, -0.23f)
            horizontalLineTo(23.05f)
            verticalLineToRelative(0.8f)
            horizontalLineToRelative(0.12f)
            verticalLineTo(20.97f)
            horizontalLineToRelative(0.13f)
            lineToRelative(0.22f, 0.34f)
            horizontalLineToRelative(0.13f)
            lineToRelative(-0.23f, -0.35f)
            curveTo(23.55f, 20.95f, 23.64f, 20.89f, 23.64f, 20.74f)
            lineTo(23.64f, 20.74f)
            close()
        }
    }.also { _Mcdonalds = it }
