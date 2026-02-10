package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Tr.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.23f, 18.27f)
                curveToRelative(-0.1f, 0.15f, -0.26f, 0.24f, -0.43f, 0.24f)
                curveToRelative(-0.09f, 0f, -0.18f, -0.02f, -0.26f, -0.07f)
                lineToRelative(-9.05f, -5.54f)
                verticalLineToRelative(10.61f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-10.61f)
                lineToRelative(-9.05f, 5.54f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.26f, 0.07f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.09f, -0.43f, -0.24f)
                curveToRelative(-0.14f, -0.23f, -0.07f, -0.54f, 0.17f, -0.69f)
                lineToRelative(9.11f, -5.58f)
                lineTo(1.93f, 6.42f)
                curveToRelative(-0.24f, -0.14f, -0.31f, -0.45f, -0.17f, -0.69f)
                curveToRelative(0.15f, -0.24f, 0.46f, -0.31f, 0.69f, -0.17f)
                lineToRelative(9.05f, 5.54f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.61f)
                lineToRelative(9.05f, -5.54f)
                curveToRelative(0.23f, -0.14f, 0.54f, -0.07f, 0.69f, 0.17f)
                curveToRelative(0.14f, 0.23f, 0.07f, 0.54f, -0.17f, 0.69f)
                lineToRelative(-9.11f, 5.58f)
                lineToRelative(9.11f, 5.58f)
                curveToRelative(0.24f, 0.14f, 0.31f, 0.45f, 0.17f, 0.69f)
                close()
            }
        }.also { _MedicalStar = it}
