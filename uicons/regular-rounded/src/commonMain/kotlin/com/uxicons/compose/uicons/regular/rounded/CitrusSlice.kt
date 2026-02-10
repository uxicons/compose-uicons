package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Rr.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 1.79f)
                curveToRelative(-0.58f, -0.98f, -1.57f, -1.62f, -2.71f, -1.76f)
                curveToRelative(-1.16f, -0.14f, -2.29f, 0.25f, -3.11f, 1.07f)
                lineTo(1.09f, 16.11f)
                curveToRelative(-0.82f, 0.82f, -1.21f, 1.96f, -1.07f, 3.11f)
                curveToRelative(0.14f, 1.14f, 0.78f, 2.12f, 1.76f, 2.71f)
                curveToRelative(2.34f, 1.4f, 4.94f, 2.08f, 7.52f, 2.08f)
                curveToRelative(3.8f, 0f, 7.55f, -1.47f, 10.39f, -4.31f)
                curveToRelative(4.76f, -4.77f, 5.68f, -12.13f, 2.23f, -17.91f)
                close()
                moveTo(18.96f, 17.55f)
                lineToRelative(-7.55f, -7.55f)
                horizontalLineToRelative(10.57f)
                curveToRelative(-0.15f, 2.72f, -1.17f, 5.38f, -3.02f, 7.55f)
                close()
                moveTo(10f, 11.41f)
                lineToRelative(7.55f, 7.55f)
                curveToRelative(-2.16f, 1.85f, -4.82f, 2.87f, -7.55f, 3.02f)
                verticalLineToRelative(-10.57f)
                close()
                moveTo(17.53f, 2.51f)
                curveToRelative(0.33f, -0.33f, 0.77f, -0.51f, 1.23f, -0.51f)
                curveToRelative(0.77f, 0f, 1.19f, 0.37f, 1.46f, 0.81f)
                curveToRelative(0.97f, 1.62f, 1.53f, 3.4f, 1.72f, 5.19f)
                horizontalLineToRelative(-9.9f)
                lineToRelative(5.49f, -5.49f)
                close()
                moveTo(2.01f, 18.98f)
                curveToRelative(-0.07f, -0.54f, 0.11f, -1.07f, 0.5f, -1.45f)
                lineToRelative(5.49f, -5.49f)
                verticalLineToRelative(9.9f)
                curveToRelative(-1.79f, -0.19f, -3.56f, -0.75f, -5.19f, -1.72f)
                curveToRelative(-0.44f, -0.27f, -0.74f, -0.72f, -0.8f, -1.24f)
                close()
            }
        }.also { _CitrusSlice = it}
