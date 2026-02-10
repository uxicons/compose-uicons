package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashList: ImageVector? = null

val Icons.Tr.TrashList: ImageVector
    get() = _TrashList ?: UXIcon(name = "TrashList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(22.5f, 14f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(21.5f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(17.17f, 22.17f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.04f, 0.71f)
                curveToRelative(-0.82f, 0.73f, -1.88f, 1.12f, -2.98f, 1.12f)
                horizontalLineToRelative(-6.27f)
                curveToRelative(-2.34f, 0f, -4.26f, -1.75f, -4.48f, -4.08f)
                lineToRelative(-1.39f, -14.87f)
                curveToRelative(-0.0f, -0.02f, -0.0f, -0.03f, -0.0f, -0.05f)
                lineTo(0.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.03f)
                curveToRelative(0.25f, -2.25f, 2.16f, -4f, 4.47f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.31f, 0f, 4.22f, 1.75f, 4.47f, 4f)
                horizontalLineToRelative(5.03f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, -0.0f, 0.05f)
                lineToRelative(-0.14f, 1.5f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.45f, -0.5f, 0.45f)
                curveToRelative(-0.02f, 0f, -0.03f, 0f, -0.05f, -0.0f)
                curveToRelative(-0.28f, -0.03f, -0.48f, -0.27f, -0.45f, -0.54f)
                lineToRelative(0.13f, -1.45f)
                lineTo(3.0f, 5f)
                lineToRelative(1.39f, 14.83f)
                curveToRelative(0.17f, 1.81f, 1.67f, 3.17f, 3.48f, 3.17f)
                horizontalLineToRelative(6.27f)
                curveToRelative(0.85f, 0f, 1.68f, -0.31f, 2.31f, -0.88f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.16f, 0.71f, 0.04f)
                close()
                moveTo(6.54f, 4f)
                horizontalLineToRelative(8.93f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                close()
            }
        }.also { _TrashList = it}
