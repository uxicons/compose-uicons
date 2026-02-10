package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FieldHockey: ImageVector? = null

val Icons.Sc.FieldHockey: ImageVector
    get() = _FieldHockey ?: UXIcon(name = "FieldHockey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.93f, 16.49f)
                curveToRelative(-0.72f, -0.72f, -1.44f, -1.07f, -2.19f, -1.07f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.99f, 0f, -1.73f, 0.62f, -2.19f, 1.09f)
                curveToRelative(-1.82f, 1.82f, -1.01f, 3.39f, -0.01f, 4.39f)
                curveToRelative(0.72f, 0.72f, 1.44f, 1.07f, 2.19f, 1.07f)
                curveToRelative(0.99f, 0f, 1.73f, -0.62f, 2.19f, -1.09f)
                curveToRelative(1.82f, -1.82f, 1.01f, -3.39f, 0.01f, -4.39f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.41f, 9.19f)
                curveToRelative(-1.24f, -0.61f, -2.73f, -0.87f, -3.54f, -0.37f)
                lineToRelative(-3.05f, 6.15f)
                curveToRelative(-0.15f, 0.3f, -0.52f, 0.43f, -0.82f, 0.28f)
                curveToRelative(-0.3f, -0.15f, -0.43f, -0.52f, -0.28f, -0.82f)
                curveToRelative(0.81f, -1.65f, 0.14f, -3.65f, -1.51f, -4.46f)
                curveToRelative(-1.65f, -0.82f, -3.65f, -0.14f, -4.46f, 1.5f)
                curveToRelative(-0.86f, 1.74f, -0.99f, 3.71f, -0.37f, 5.55f)
                curveToRelative(0.62f, 1.84f, 1.92f, 3.33f, 3.66f, 4.19f)
                curveToRelative(1.04f, 0.51f, 2.14f, 0.76f, 3.22f, 0.76f)
                curveToRelative(2.68f, 0f, 5.26f, -1.48f, 6.53f, -4.04f)
                lineToRelative(3.05f, -6.15f)
                curveToRelative(-0.09f, -0.95f, -1.2f, -1.97f, -2.43f, -2.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.97f, 9.5f)
                lineToRelative(1.62f, -3.27f)
                curveToRelative(0.36f, -0.73f, 0.28f, -1.58f, -0.23f, -2.33f)
                curveToRelative(-0.37f, -0.54f, -0.95f, -1.03f, -1.65f, -1.38f)
                curveToRelative(-1.76f, -0.87f, -3.44f, -0.57f, -4.09f, 0.74f)
                lineToRelative(-1.62f, 3.27f)
                curveToRelative(1.01f, 0f, 2.14f, 0.28f, 3.3f, 0.85f)
                curveToRelative(1.16f, 0.57f, 2.06f, 1.3f, 2.67f, 2.1f)
                close()
            }
        }.also { _FieldHockey = it}
