package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Tr.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.67f, 19.85f)
                lineTo(14.11f, 1.29f)
                curveTo(13.69f, 0.5f, 12.9f, 0.02f, 12f, 0.02f)
                reflectiveCurveToRelative(-1.69f, 0.47f, -2.11f, 1.27f)
                lineTo(0.33f, 19.85f)
                curveToRelative(-0.47f, 0.89f, -0.44f, 1.94f, 0.08f, 2.8f)
                curveToRelative(0.52f, 0.86f, 1.43f, 1.38f, 2.43f, 1.38f)
                horizontalLineToRelative(18.32f)
                curveToRelative(1.0f, 0f, 1.91f, -0.51f, 2.43f, -1.38f)
                curveToRelative(0.52f, -0.86f, 0.55f, -1.91f, 0.08f, -2.79f)
                close()
                moveTo(10.78f, 1.76f)
                curveToRelative(0.24f, -0.46f, 0.7f, -0.74f, 1.22f, -0.74f)
                reflectiveCurveToRelative(0.98f, 0.28f, 1.22f, 0.73f)
                lineToRelative(3.66f, 7.11f)
                curveToRelative(-0.02f, 0.02f, -1.74f, 2.94f, -1.74f, 2.94f)
                curveToRelative(-0.1f, 0.17f, -0.27f, 0.19f, -0.34f, 0.19f)
                curveToRelative(-0.08f, -0.03f, -0.23f, -0.02f, -0.34f, -0.19f)
                lineToRelative(-1.04f, -1.72f)
                curveToRelative(-0.09f, -0.15f, -0.25f, -0.24f, -0.42f, -0.24f)
                curveToRelative(-0.13f, 0.02f, -0.34f, 0.09f, -0.43f, 0.23f)
                lineToRelative(-1.69f, 2.7f)
                curveToRelative(-0.12f, 0.2f, -0.29f, 0.26f, -0.39f, 0.22f)
                curveToRelative(-0.08f, 0f, -0.27f, -0.02f, -0.39f, -0.22f)
                curveToRelative(0f, 0f, -2.75f, -4.33f, -2.77f, -4.35f)
                lineToRelative(3.44f, -6.67f)
                close()
                moveTo(22.73f, 22.13f)
                curveToRelative(-0.34f, 0.56f, -0.92f, 0.89f, -1.57f, 0.89f)
                lineTo(2.84f, 23.02f)
                curveToRelative(-0.65f, 0f, -1.24f, -0.33f, -1.57f, -0.89f)
                curveToRelative(-0.34f, -0.56f, -0.35f, -1.24f, -0.05f, -1.82f)
                curveToRelative(0f, -0.0f, 0.0f, -0.0f, 0.0f, -0.01f)
                lineToRelative(5.59f, -10.86f)
                lineToRelative(2.44f, 3.87f)
                curveToRelative(0.27f, 0.43f, 0.73f, 0.68f, 1.24f, 0.68f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.51f, 0f, 0.97f, -0.26f, 1.24f, -0.69f)
                lineToRelative(1.26f, -2.01f)
                lineToRelative(0.62f, 1.02f)
                curveToRelative(0.26f, 0.42f, 0.7f, 0.67f, 1.19f, 0.67f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.5f, -0.0f, 0.94f, -0.26f, 1.19f, -0.69f)
                lineToRelative(1.41f, -2.41f)
                lineToRelative(5.37f, 10.42f)
                curveToRelative(0.31f, 0.58f, 0.29f, 1.26f, -0.05f, 1.82f)
                close()
            }
        }.also { _Mountain = it}
